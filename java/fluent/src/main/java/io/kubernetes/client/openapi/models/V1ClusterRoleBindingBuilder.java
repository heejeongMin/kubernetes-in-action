package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ClusterRoleBindingBuilder extends io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluentImpl<io.kubernetes.client.openapi.models.V1ClusterRoleBindingBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ClusterRoleBinding,io.kubernetes.client.openapi.models.V1ClusterRoleBindingBuilder>{
  public V1ClusterRoleBindingBuilder() {
    this(false);
  }
  public V1ClusterRoleBindingBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ClusterRoleBinding(), validationEnabled);
  }
  public V1ClusterRoleBindingBuilder(io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ClusterRoleBindingBuilder(io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ClusterRoleBinding(), validationEnabled);
  }
  public V1ClusterRoleBindingBuilder(io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent<?> fluent,io.kubernetes.client.openapi.models.V1ClusterRoleBinding instance) {
    this(fluent, instance, false);
  }
  public V1ClusterRoleBindingBuilder(io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent<?> fluent,io.kubernetes.client.openapi.models.V1ClusterRoleBinding instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withRoleRef(instance.getRoleRef());

    fluent.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  public V1ClusterRoleBindingBuilder(io.kubernetes.client.openapi.models.V1ClusterRoleBinding instance) {
    this(instance,false);
  }
  public V1ClusterRoleBindingBuilder(io.kubernetes.client.openapi.models.V1ClusterRoleBinding instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRoleRef(instance.getRoleRef());

    this.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ClusterRoleBindingFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ClusterRoleBinding build() {
    V1ClusterRoleBinding buildable = new V1ClusterRoleBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setRoleRef(fluent.getRoleRef());
    buildable.setSubjects(fluent.getSubjects());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ClusterRoleBindingBuilder that = (V1ClusterRoleBindingBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}