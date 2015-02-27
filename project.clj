(defproject sample-appender "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :plugins [[lein-midje "3.1.3"]
            [lein-cloverage "1.0.2"]]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.stuartsierra/component "0.2.2"]
                 [ch.qos.logback/logback-classic "1.1.1"]]

  :main sample-appender.core

  :aot [sample-appender.appender])