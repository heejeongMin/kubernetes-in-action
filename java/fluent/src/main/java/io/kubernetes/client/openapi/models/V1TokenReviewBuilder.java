package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1TokenReviewBuilder extends io.kubernetes.client.openapi.models.V1TokenReviewFluentImpl<io.kubernetes.client.openapi.models.V1TokenReviewBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1TokenReview,io.kubernetes.client.openapi.models.V1TokenReviewBuilder>{
  public V1TokenReviewBuilder() {
    this(false);
  }
  public V1TokenReviewBuilder(java.lang.Boolean validationEnabled) {
    this(new V1TokenReview(), validationEnabled);
  }
  public V1TokenReviewBuilder(io.kubernetes.client.openapi.models.V1TokenReviewFluent<?> fluent) {
    this(fluent, false);
  }
  public V1TokenReviewBuilder(io.kubernetes.client.openapi.models.V1TokenReviewFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1TokenReview(), validationEnabled);
  }
  public V1TokenReviewBuilder(io.kubernetes.client.openapi.models.V1TokenReviewFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenReview instance) {
    this(fluent, instance, false);
  }
  public V1TokenReviewBuilder(io.kubernetes.client.openapi.models.V1TokenReviewFluent<?> fluent,io.kubernetes.client.openapi.models.V1TokenReview instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1TokenReviewBuilder(io.kubernetes.client.openapi.models.V1TokenReview instance) {
    this(instance,false);
  }
  public V1TokenReviewBuilder(io.kubernetes.client.openapi.models.V1TokenReview instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1TokenReviewFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1TokenReview build() {
    V1TokenReview buildable = new V1TokenReview();
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
    V1TokenReviewBuilder that = (V1TokenReviewBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}