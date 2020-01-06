(ns clj.Email)


#_(comment

  (def mail-config
    {:host "smtp.sendgrid.net"
     :port 2525
     :user "maxweber"
     :pass "XMe2SbPab5S/CvwSJmOhZNuauBPulw/ol8Av4lXbNI4="})

  (println "Hello world, the time is ")

  (def email
    (prepare-email "metrics"
                   "nils@vire.co"))

  (send-mail mail-config email)

  )