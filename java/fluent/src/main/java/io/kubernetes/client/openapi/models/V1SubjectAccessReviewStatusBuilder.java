package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1SubjectAccessReviewStatusBuilder extends io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluentImpl<io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus,io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusBuilder>{
  public V1SubjectAccessReviewStatusBuilder() {
    this(false);
  }
  public V1SubjectAccessReviewStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1SubjectAccessReviewStatus(), validationEnabled);
  }
  public V1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1SubjectAccessReviewStatus(), validationEnabled);
  }
  public V1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus instance) {
    this(fluent, instance, false);
  }
  public V1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAllowed(instance.getAllowed());

    fluent.withDenied(instance.getDenied());

    fluent.withEvaluationError(instance.getEvaluationError());

    fluent.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  public V1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus instance) {
    this(instance,false);
  }
  public V1SubjectAccessReviewStatusBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAllowed(instance.getAllowed());

    this.withDenied(instance.getDenied());

    this.withEvaluationError(instance.getEvaluationError());

    this.withReason(instance.getReason());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewStatus build() {
    V1SubjectAccessReviewStatus buildable = new V1SubjectAccessReviewStatus();
    buildable.setAllowed(fluent.getAllowed());
    buildable.setDenied(fluent.getDenied());
    buildable.setEvaluationError(fluent.getEvaluationError());
    buildable.setReason(fluent.getReason());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SubjectAccessReviewStatusBuilder that = (V1SubjectAccessReviewStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}