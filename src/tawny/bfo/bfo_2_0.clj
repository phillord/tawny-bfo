(ns tawny.bfo.bfo-2-0
  (:require [tawny owl read]))


;; BFO uses OBO style identifiers, so we transform the label.
(tawny.read/defread bfo-2-0
  :location (tawny.owl/iri (clojure.java.io/resource "bfo-2.0.owl"))
  ;; the prefix that you want to use in this case
  :prefix "bfo"
  :iri "http://purl.obolibrary.org/obo/bfo.owl"
  :viri "http://purl.obolibrary.org/obo/bfo/2.0/bfo.owl"
  :transform #'tawny.read/label-transform
  :filter (partial #'tawny.read/iri-starts-with-filter
                   "http://purl.obolibrary.org/obo/BFO"))
