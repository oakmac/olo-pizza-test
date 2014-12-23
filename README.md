# olo pizza test

A quick proof-of-concept to see how quickly a coding test can be accomplished
using ClojureScript.

## Run

1. Install [Leiningen] and [Node.js].
1. Run from the project directory:

    ```sh
    # compile ClojureScript files (this may take a minute)
    lein cljsbuild clean && lein cljsbuild once

    # run node
    node app.js
    ```

[Leiningen]:http://leiningen.org
[Node.js]:http://nodejs.org
