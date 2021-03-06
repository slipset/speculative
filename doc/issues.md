# Issues found while developing and using speculative

Issues are sorted by date from newest to oldest.

## Unfixed or unreleased

- [Align behavior of set/union and into with Clojure](https://dev.clojure.org/jira/browse/CLJS-3054) (CLJS)
- [let macro doesn't work in CLJS](https://dev.clojure.org/jira/browse/TCHECK-154) (TCHECK)
- [Generator in keys* spec not overridable](https://dev.clojure.org/jira/browse/CLJ-2483) (CLJ)
- [Undefined fdef is still present in result of (stest/checkable-syms)](https://dev.clojure.org/jira/browse/CLJS-3049) (CLJS)
- [Unify behavior of shuffle in CLJ and CLJS](https://dev.clojure.org/jira/browse/CLJ-2470) (CLJ)
- [Spec'ed fn doesn't throw when called lazily](https://dev.clojure.org/jira/browse/CLJ-2443) (CLJ)
- [stest/unstrument is called at unexpected time when used in finally block](https://dev.clojure.org/jira/browse/CLJS-2949) (CLJS)
- [Remove useless call to merge](https://github.com/juxt/yada/pull/246) (juxt/yada)

## Fixed and released

- [Instrumenting next gives maximum call stack size exceeded](https://dev.clojure.org/jira/browse/CLJS-3023) (CLJS)
- [Requiring clojure.spec.test.alpha loads clojure.test.check](https://dev.clojure.org/jira/browse/CLJS-2964) (CLJS)
- [Unify namespace for interacting with clojure.test.check](https://dev.clojure.org/jira/browse/CLJS-2952) (CLJS)
- [+ can't be instrumented in Planck REPL](https://github.com/borkdude/speculative/issues/214) (Planck)
- [Instrumented self-calling multi-arity fn throws maximum call stack exceeded with optimizations advanced](https://dev.clojure.org/jira/browse/CLJS-2995) (CLJS)
- [re-seq is relying on undefined behavior of subs](https://dev.clojure.org/jira/browse/CLJS-2979) (CLJS)
- [unstrument returns symbol of non-instrumented var](https://dev.clojure.org/jira/browse/CLJS-2975) (CLJS)
- [Coal-mine test found use of merge that doesn't conform to spec](https://github.com/borkdude/speculative/issues/113) (4clojure)
- [Make clojure.spec.alpha reloadable](https://dev.clojure.org/jira/browse/CLJS-2967) (CLJS)
- [Stack overflow when specing core =](https://dev.clojure.org/jira/browse/CLJS-2956) (CLJS)
- [Self-host: spec check macro compile-time expansion](https://dev.clojure.org/jira/browse/CLJS-2955) (CLJS)
- [stest/with-instrument-disabled prints warning of private use](https://dev.clojure.org/jira/browse/CLJS-2953) (CLJS)
- [Stack overflow calling instrumented variadic fn with zero args](https://dev.clojure.org/jira/browse/CLJS-2948) (CLJS)
- [merge-with being passed seq of lazy-seqs](https://github.com/gf3/secretary/issues/100) (gf3/secretary)
- [Update merge-with to use key / val](https://dev.clojure.org/jira/browse/CLJS-2943) (CLJS)
- [spec fdef triggering for variadic fn](https://dev.clojure.org/jira/browse/CLJS-2942) (CLJS)
- [Can't define nilable spec on undefined pred](https://dev.clojure.org/jira/browse/CLJS-2940) (CLJS)

# Other known issues related to self-spec'ing Clojure

## Open

- [\[spec\] :clojure.spec/invalid is not a valid :clojure.spec/any value](https://dev.clojure.org/jira/browse/CLJ-1966) (CLJ + CLJS)
