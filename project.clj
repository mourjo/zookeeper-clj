(defproject zookeeper-clj "0.9.5-SNAPSHOT"
  :description "A Clojure DSL for Apache ZooKeeper"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.apache.zookeeper/zookeeper "3.6.1"]
                 [commons-codec "1.14"]]
  :repositories {"clojars" {:sign-releases false :url "https://clojars.org/repo/"}}
  :global-vars {*warn-on-reflection* true}
  :profiles {:dev {:dependencies [[org.apache.curator/curator-test "5.1.0"]]}}
  :plugins [[lein-ancient "0.6.15"]
            [lein-cljfmt "0.6.8"]])
