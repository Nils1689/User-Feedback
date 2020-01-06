(ns clj.feedback
  (:require [postal.core :as p]))

(defn prepare-email
  "Prepares the email in the Postal data format."
  [params]
  {:from (:user-email params)
   :to (:support-email params)
   :subject "Userfeedback"
   :body [{:type "text/html; charset=utf-8"
           :content
           (c/html
             (:feedback-message params))}]})

(defn send-mail
  [mail-config mail]
  (p/send-message
    mail-config
    mail))

(defn send! [mail-config params]
  (let [email (prepare-email params)]
    (send-mail mail-config email)))