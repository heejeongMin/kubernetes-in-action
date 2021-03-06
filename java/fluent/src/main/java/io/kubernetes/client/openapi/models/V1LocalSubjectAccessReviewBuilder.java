package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1LocalSubjectAccessReviewBuilder extends io.kubernetes.client.openapi.models.V1LocalSubjectAccessReviewFluentImpl<io.kubernetes.client.openapi.models.V1LocalSubjectAccessReviewBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1LocalSubjectAccessReview,io.kubernetes.client.openapi.models.V1LocalSubjectAccessReviewBuilder>{
  public V1LocalSubjectAccessReviewBuilder() {
    this(false);
  }
  public V1LocalSubjectAccessReviewBuilder(java.lang.Boolean validationEnabled) {
    this(new V1LocalSubjectAccessReview(), validationEnabled);
  }
  public V1LocalSubjectAccessReviewBuilder(io.kubernetes.client.openapi.models.V1LocalSubjectAccessReviewFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LocalSubjectAccessReviewBuilder(io.kubernetes.client.openapi.models.V1LocalSubjectAccessReviewFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1LocalSubjectAccessReview(), validationEnabled);
  }
  public V1LocalSubjectAccessReviewBuilder(io.kubernetes.client.openapi.models.V1LocalSubjectAccessReviewFluent<?> fluent,io.kubernetes.client.openapi.models.V1LocalSubjectAccessReview instance) {
    this(fluent, instance, false);
  }
  public V1LocalSubjectAccessReviewBuilder(io.kubernetes.client.openapi.models.V1LocalSubjectAccessReviewFluent<?> fluent,io.kubernetes.client.openapi.models.V1LocalSubjectAccessReview instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1LocalSubjectAccessReviewBuilder(io.kubernetes.client.openapi.models.V1LocalSubjectAccessReview instance) {
    this(instance,false);
  }
  public V1LocalSubjectAccessReviewBuilder(io.kubernetes.client.openapi.models.V1LocalSubjectAccessReview instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1LocalSubjectAccessReviewFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1LocalSubjectAccessReview build() {
    V1LocalSubjectAccessReview buildable = new V1LocalSubjectAccessReview();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LocalSubjectAccessReviewBuilder that = (V1LocalSubjectAccessReviewBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}