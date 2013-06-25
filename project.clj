(defproject com.taoensso/faraday "0.10.0"
  :description "Clojure DynamoDB client"
  :url "https://github.com/ptaoussanis/faraday"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure        "1.5.1"]
                 [org.clojure/tools.macro    "0.1.2"]
                 [com.amazonaws/aws-java-sdk "1.4.7"]
                 [expectations               "1.4.43"]
                 [com.taoensso/nippy         "2.0.0-RC1"]]
  :profiles {:1.5   {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6   {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}
             :dev   {:dependencies []}
             :test  {:dependencies []}
             :bench {:dependencies [] :jvm-opts ["-server"]}}
  :aliases {"test-all"    ["with-profile" "test,1.5:test,1.6" "expectations"]
            "test-auto"   ["with-profile" "test" "autoexpect"]
            "start-dev"   ["with-profile" "dev,test" "repl" ":headless"]
            "start-bench" ["trampoline" "start-dev"]}
  :plugins [[lein-expectations "0.0.7"]
            [lein-autoexpect   "0.2.5"]
            [codox             "0.6.4"]]
  :min-lein-version "2.0.0"
  :warn-on-reflection true
  :repositories
  {"sonatype"
   {:url "http://oss.sonatype.org/content/repositories/releases"
    :snapshots false
    :releases {:checksum :fail}}
   "sonatype-snapshots"
   {:url "http://oss.sonatype.org/content/repositories/snapshots"
    :snapshots true
    :releases {:checksum :fail :update :always}}})