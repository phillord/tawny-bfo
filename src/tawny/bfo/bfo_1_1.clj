(ns tawny.bfo.bfo-1-1
  (:require [tawny owl read]))


;; BFO-1.1 provides meaningful IRI fragments and normally I would use
;; these to define the intern name. However, BFO-2.0 uses OBO style
;; identifiers, and so we have to use a label transform there. Because
;; the IRI fragment names in BFO-1.1 use camel case, it makes more
;; sense to do the same here, or otherwise even names consistent
;; between the two have to be retyped.

;; As a nice side-effect, this also means we can avoid the problem
;; that BFO has two concepts that are also java.lang classes (Object
;; and Process) which otherwise have to be specifically avoided.
(tawny.read/defread bfo-1-1
  ;; something that the OWL API can interpret. This includes a stream, so
  ;; it's totally generic.
  :location (tawny.owl/iri (clojure.java.io/resource "bfo-1.1.owl"))
  ;; the prefix that you want to use in this case
  :prefix "bfo-one"
  ;; normally only things from this IRI will be imported
  :iri "http://www.ifomis.org/bfo/1.1"
  :transform #'tawny.read/label-transform)
