package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PodDisruptionBudgetBuilder extends io.kubernetes.client.openapi.models.V1PodDisruptionBudgetFluentImpl<io.kubernetes.client.openapi.models.V1PodDisruptionBudgetBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodDisruptionBudget,io.kubernetes.client.openapi.models.V1PodDisruptionBudgetBuilder>{
  public V1PodDisruptionBudgetBuilder() {
    this(false);
  }
  public V1PodDisruptionBudgetBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodDisruptionBudget(), validationEnabled);
  }
  public V1PodDisruptionBudgetBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodDisruptionBudgetBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodDisruptionBudget(), validationEnabled);
  }
  public V1PodDisruptionBudgetBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodDisruptionBudget instance) {
    this(fluent, instance, false);
  }
  public V1PodDisruptionBudgetBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudgetFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodDisruptionBudget instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodDisruptionBudgetBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudget instance) {
    this(instance,false);
  }
  public V1PodDisruptionBudgetBuilder(io.kubernetes.client.openapi.models.V1PodDisruptionBudget instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PodDisruptionBudgetFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PodDisruptionBudget build() {
    V1PodDisruptionBudget buildable = new V1PodDisruptionBudget();
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
    V1PodDisruptionBudgetBuilder that = (V1PodDisruptionBudgetBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}