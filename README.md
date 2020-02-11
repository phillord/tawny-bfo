# Tawny-BFO

This is an import of BFO, the Basic Formal Ontology. Both BFO 2 and
BFO-1.1 are supported. Concepts can be refered by names derived from
their labels.


## Usage

    user> (use 'tawny.bfo.bfo-2-0)
    nil
    user> process
    #[Class 0x1f85f112 BFO_0000015]
    user> (use 'tawny.repl)
    nil
    user> (fetch-doc process)
    "\nClass: tawny.bfo.bfo-2-0/process\nIRI: ..."

## License

Copyright © 2017 Phillip Lord, Newcastle University,
BFO is: Creative Commons 3.0 BY http://creativecommons.org/licenses/by/3.0/
Code is:
New BSD License: http://opensource.org/licenses/BSD-3-Clause or
LGPL: https://www.gnu.org/licenses/lgpl-3.0.en.html
