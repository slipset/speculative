;; GENERATED BY script/update-syms. DO NOT EDIT BY HAND.
(ns
 speculative.impl.syms
 {:no-doc true}
 (:require [clojure.set] [clojure.string]))
(def
 all-syms-clj
 '#{clojure.core/*
    clojure.core/+
    clojure.core/-
    clojure.core//
    clojure.core/=
    clojure.core/apply
    clojure.core/assoc
    clojure.core/assoc-in
    clojure.core/atom
    clojure.core/comp
    clojure.core/conj
    clojure.core/cons
    clojure.core/count
    clojure.core/dec
    clojure.core/dedupe
    clojure.core/dissoc
    clojure.core/distinct
    clojure.core/every-pred
    clojure.core/every?
    clojure.core/filter
    clojure.core/find
    clojure.core/first
    clojure.core/flatten
    clojure.core/fnil
    clojure.core/frequencies
    clojure.core/get
    clojure.core/get-in
    clojure.core/group-by
    clojure.core/hash-map
    clojure.core/hash-set
    clojure.core/inc
    clojure.core/interpose
    clojure.core/into
    clojure.core/juxt
    clojure.core/keep
    clojure.core/keys
    clojure.core/last
    clojure.core/list
    clojure.core/map
    clojure.core/max
    clojure.core/max-key
    clojure.core/merge
    clojure.core/merge-with
    clojure.core/min
    clojure.core/min-key
    clojure.core/next
    clojure.core/nil?
    clojure.core/not
    clojure.core/not-any?
    clojure.core/not-every?
    clojure.core/nth
    clojure.core/partial
    clojure.core/partition
    clojure.core/partition-all
    clojure.core/partition-by
    clojure.core/peek
    clojure.core/pop
    clojure.core/range
    clojure.core/re-find
    clojure.core/re-groups
    clojure.core/re-matcher
    clojure.core/re-matches
    clojure.core/re-pattern
    clojure.core/re-seq
    clojure.core/reduce
    clojure.core/remove
    clojure.core/reset!
    clojure.core/rest
    clojure.core/select-keys
    clojure.core/seq
    clojure.core/shuffle
    clojure.core/some
    clojure.core/some-fn
    clojure.core/some?
    clojure.core/str
    clojure.core/subs
    clojure.core/swap!
    clojure.core/update
    clojure.core/update-in
    clojure.core/vals
    clojure.core/vec
    clojure.core/vector
    clojure.core/zipmap
    clojure.set/difference
    clojure.set/index
    clojure.set/intersection
    clojure.set/join
    clojure.set/map-invert
    clojure.set/project
    clojure.set/rename
    clojure.set/rename-keys
    clojure.set/select
    clojure.set/subset?
    clojure.set/superset?
    clojure.set/union
    clojure.string/ends-with?
    clojure.string/join
    clojure.string/starts-with?})
(def
 all-syms-cljs
 '#{cljs.core/*
    cljs.core/+
    cljs.core/-
    cljs.core//
    cljs.core/=
    cljs.core/apply
    cljs.core/assoc
    cljs.core/assoc-in
    cljs.core/atom
    cljs.core/comp
    cljs.core/conj
    cljs.core/cons
    cljs.core/count
    cljs.core/dec
    cljs.core/dedupe
    cljs.core/dissoc
    cljs.core/distinct
    cljs.core/every-pred
    cljs.core/every?
    cljs.core/filter
    cljs.core/find
    cljs.core/first
    cljs.core/flatten
    cljs.core/fnil
    cljs.core/frequencies
    cljs.core/get
    cljs.core/get-in
    cljs.core/group-by
    cljs.core/hash-map
    cljs.core/hash-set
    cljs.core/inc
    cljs.core/interpose
    cljs.core/into
    cljs.core/juxt
    cljs.core/keep
    cljs.core/keys
    cljs.core/last
    cljs.core/list
    cljs.core/map
    cljs.core/max
    cljs.core/max-key
    cljs.core/merge
    cljs.core/merge-with
    cljs.core/min
    cljs.core/min-key
    cljs.core/next
    cljs.core/nil?
    cljs.core/not
    cljs.core/not-any?
    cljs.core/not-every?
    cljs.core/nth
    cljs.core/partial
    cljs.core/partition
    cljs.core/partition-all
    cljs.core/partition-by
    cljs.core/peek
    cljs.core/pop
    cljs.core/range
    cljs.core/re-find
    cljs.core/re-matches
    cljs.core/re-pattern
    cljs.core/re-seq
    cljs.core/reduce
    cljs.core/remove
    cljs.core/reset!
    cljs.core/rest
    cljs.core/select-keys
    cljs.core/seq
    cljs.core/shuffle
    cljs.core/some
    cljs.core/some-fn
    cljs.core/some?
    cljs.core/str
    cljs.core/subs
    cljs.core/swap!
    cljs.core/update
    cljs.core/update-in
    cljs.core/vals
    cljs.core/vec
    cljs.core/vector
    cljs.core/zipmap
    clojure.set/difference
    clojure.set/index
    clojure.set/intersection
    clojure.set/join
    clojure.set/map-invert
    clojure.set/project
    clojure.set/rename
    clojure.set/rename-keys
    clojure.set/select
    clojure.set/subset?
    clojure.set/superset?
    clojure.set/union
    clojure.string/ends-with?
    clojure.string/join
    clojure.string/starts-with?})
(def
 blacklist-clj
 '#{clojure.core/=
    clojure.core/get
    clojure.core/hash-map
    clojure.core/list
    clojure.core/nil?
    clojure.core/not
    clojure.core/partition-all
    clojure.core/some?
    clojure.core/str})
(def
 blacklist-cljs
 '#{cljs.core/=
    cljs.core/apply
    cljs.core/get
    cljs.core/list
    cljs.core/next
    cljs.core/nil?
    cljs.core/not
    cljs.core/seq
    cljs.core/some?
    cljs.core/str})
(def
 instrumentable-syms-clj
 '#{clojure.core/*
    clojure.core/+
    clojure.core/-
    clojure.core//
    clojure.core/apply
    clojure.core/assoc
    clojure.core/assoc-in
    clojure.core/atom
    clojure.core/comp
    clojure.core/conj
    clojure.core/cons
    clojure.core/count
    clojure.core/dec
    clojure.core/dedupe
    clojure.core/dissoc
    clojure.core/distinct
    clojure.core/every-pred
    clojure.core/every?
    clojure.core/filter
    clojure.core/find
    clojure.core/first
    clojure.core/flatten
    clojure.core/fnil
    clojure.core/frequencies
    clojure.core/get-in
    clojure.core/group-by
    clojure.core/hash-set
    clojure.core/inc
    clojure.core/interpose
    clojure.core/into
    clojure.core/juxt
    clojure.core/keep
    clojure.core/keys
    clojure.core/last
    clojure.core/map
    clojure.core/max
    clojure.core/max-key
    clojure.core/merge
    clojure.core/merge-with
    clojure.core/min
    clojure.core/min-key
    clojure.core/next
    clojure.core/not-any?
    clojure.core/not-every?
    clojure.core/nth
    clojure.core/partial
    clojure.core/partition
    clojure.core/partition-by
    clojure.core/peek
    clojure.core/pop
    clojure.core/range
    clojure.core/re-find
    clojure.core/re-groups
    clojure.core/re-matcher
    clojure.core/re-matches
    clojure.core/re-pattern
    clojure.core/re-seq
    clojure.core/reduce
    clojure.core/remove
    clojure.core/reset!
    clojure.core/rest
    clojure.core/select-keys
    clojure.core/seq
    clojure.core/shuffle
    clojure.core/some
    clojure.core/some-fn
    clojure.core/subs
    clojure.core/swap!
    clojure.core/update
    clojure.core/update-in
    clojure.core/vals
    clojure.core/vec
    clojure.core/vector
    clojure.core/zipmap
    clojure.set/difference
    clojure.set/index
    clojure.set/intersection
    clojure.set/join
    clojure.set/map-invert
    clojure.set/project
    clojure.set/rename
    clojure.set/rename-keys
    clojure.set/select
    clojure.set/subset?
    clojure.set/superset?
    clojure.set/union
    clojure.string/ends-with?
    clojure.string/join
    clojure.string/starts-with?})
(def
 instrumentable-syms-cljs
 '#{cljs.core/*
    cljs.core/+
    cljs.core/-
    cljs.core//
    cljs.core/assoc
    cljs.core/assoc-in
    cljs.core/atom
    cljs.core/comp
    cljs.core/conj
    cljs.core/cons
    cljs.core/count
    cljs.core/dec
    cljs.core/dedupe
    cljs.core/dissoc
    cljs.core/distinct
    cljs.core/every-pred
    cljs.core/every?
    cljs.core/filter
    cljs.core/find
    cljs.core/first
    cljs.core/flatten
    cljs.core/fnil
    cljs.core/frequencies
    cljs.core/get-in
    cljs.core/group-by
    cljs.core/hash-map
    cljs.core/hash-set
    cljs.core/inc
    cljs.core/interpose
    cljs.core/into
    cljs.core/juxt
    cljs.core/keep
    cljs.core/keys
    cljs.core/last
    cljs.core/map
    cljs.core/max
    cljs.core/max-key
    cljs.core/merge
    cljs.core/merge-with
    cljs.core/min
    cljs.core/min-key
    cljs.core/not-any?
    cljs.core/not-every?
    cljs.core/nth
    cljs.core/partial
    cljs.core/partition
    cljs.core/partition-all
    cljs.core/partition-by
    cljs.core/peek
    cljs.core/pop
    cljs.core/range
    cljs.core/re-find
    cljs.core/re-matches
    cljs.core/re-pattern
    cljs.core/re-seq
    cljs.core/reduce
    cljs.core/remove
    cljs.core/reset!
    cljs.core/rest
    cljs.core/select-keys
    cljs.core/shuffle
    cljs.core/some
    cljs.core/some-fn
    cljs.core/subs
    cljs.core/swap!
    cljs.core/update
    cljs.core/update-in
    cljs.core/vals
    cljs.core/vec
    cljs.core/vector
    cljs.core/zipmap
    clojure.set/difference
    clojure.set/index
    clojure.set/intersection
    clojure.set/join
    clojure.set/map-invert
    clojure.set/project
    clojure.set/rename
    clojure.set/rename-keys
    clojure.set/select
    clojure.set/subset?
    clojure.set/superset?
    clojure.set/union
    clojure.string/ends-with?
    clojure.string/join
    clojure.string/starts-with?})
