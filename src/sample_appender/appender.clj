(ns sample-appender.appender
  (:gen-class :name sample-appender.appender.DummyAppender
              :extends ch.qos.logback.core.UnsynchronizedAppenderBase))

(defn -append [this event]
  (clojure.pprint/pprint event))