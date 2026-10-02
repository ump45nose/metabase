(ns metabase-enterprise.content-diagnostics.schema)

(def entity-types
  "Every entity type a finding can be about."
  #{:card :collection :dashboard :document :transform})
