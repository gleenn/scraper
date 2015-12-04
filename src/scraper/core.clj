(ns scraper.core
  (:require ;[clj-http.client :as http]
            [net.cgrand.enlive-html :as html]))

(defn -main
  [& x]
    (->
      "https://news.ycombinator.com"
      (java.net.URL.)
      (html/html-resource)
      (html/select [:body])
      (println)))
