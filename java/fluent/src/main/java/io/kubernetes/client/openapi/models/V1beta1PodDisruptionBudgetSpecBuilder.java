package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1PodDisruptionBudgetSpecBuilder extends io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec,io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecBuilder>{
  public V1beta1PodDisruptionBudgetSpecBuilder() {
    this(false);
  }
  public V1beta1PodDisruptionBudgetSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1PodDisruptionBudgetSpec(), validationEnabled);
  }
  public V1beta1PodDisruptionBudgetSpecBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PodDisruptionBudgetSpecBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1PodDisruptionBudgetSpec(), validationEnabled);
  }
  public V1beta1PodDisruptionBudgetSpecBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec instance) {
    this(fluent, instance, false);
  }
  public V1beta1PodDisruptionBudgetSpecBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMaxUnavailable(instance.getMaxUnavailable());

    fluent.withMinAvailable(instance.getMinAvailable());

    fluent.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PodDisruptionBudgetSpecBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec instance) {
    this(instance,false);
  }
  public V1beta1PodDisruptionBudgetSpecBuilder(io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withMaxUnavailable(instance.getMaxUnavailable());

    this.withMinAvailable(instance.getMinAvailable());

    this.withSelector(instance.getSelector());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetSpec build() {
    V1beta1PodDisruptionBudgetSpec buildable = new V1beta1PodDisruptionBudgetSpec();
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    buildable.setMinAvailable(fluent.getMinAvailable());
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1PodDisruptionBudgetSpecBuilder that = (V1beta1PodDisruptionBudgetSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}