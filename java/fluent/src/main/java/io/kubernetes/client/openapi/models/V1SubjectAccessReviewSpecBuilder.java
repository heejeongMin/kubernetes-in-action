package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1SubjectAccessReviewSpecBuilder extends io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluentImpl<io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec,io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecBuilder>{
  public V1SubjectAccessReviewSpecBuilder() {
    this(false);
  }
  public V1SubjectAccessReviewSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1SubjectAccessReviewSpec(), validationEnabled);
  }
  public V1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1SubjectAccessReviewSpec(), validationEnabled);
  }
  public V1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec instance) {
    this(fluent, instance, false);
  }
  public V1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withExtra(instance.getExtra());

    fluent.withGroups(instance.getGroups());

    fluent.withNonResourceAttributes(instance.getNonResourceAttributes());

    fluent.withResourceAttributes(instance.getResourceAttributes());

    fluent.withUid(instance.getUid());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  public V1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec instance) {
    this(instance,false);
  }
  public V1SubjectAccessReviewSpecBuilder(io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withNonResourceAttributes(instance.getNonResourceAttributes());

    this.withResourceAttributes(instance.getResourceAttributes());

    this.withUid(instance.getUid());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1SubjectAccessReviewSpec build() {
    V1SubjectAccessReviewSpec buildable = new V1SubjectAccessReviewSpec();
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setNonResourceAttributes(fluent.getNonResourceAttributes());
    buildable.setResourceAttributes(fluent.getResourceAttributes());
    buildable.setUid(fluent.getUid());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SubjectAccessReviewSpecBuilder that = (V1SubjectAccessReviewSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}