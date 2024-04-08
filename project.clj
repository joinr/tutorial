(defproject tutorial "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]]
  :repl-options {:init-ns tutorial.core})

#_
(defproject tutorial "0.1.0-SNAPSHOT" 
  :description "A Clojure project for learning purposes" 
  :license {:name "Eclipse Public License" 
            :url "http://www.eclipse.org/legal/epl-v10.html"}   
  :dependencies [[org.clojure/clojure "1.10.1"]]   
  :main ^:skip-aot tutorial   
  :target-path "target/%s" 
  :profiles {:uberjar {:aot :all}}) 
