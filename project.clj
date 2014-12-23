(defproject olo-pizza-test "0.1.0"

  :dependencies [
    [org.clojure/clojure "1.6.0"]
    [org.clojure/clojurescript "0.0-2511"]]

  :plugins [[lein-cljsbuild "1.0.3"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds {
     :main {
      :source-paths ["src-cljs"]
      :compiler {
        :language-in :ecmascript5
        :language-out :ecmascript5
        :target :nodejs
        :output-to "app.js"
        :optimizations :simple }}}})
