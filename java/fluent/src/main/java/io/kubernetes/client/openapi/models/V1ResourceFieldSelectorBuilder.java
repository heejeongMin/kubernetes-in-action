package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ResourceFieldSelectorBuilder extends io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluentImpl<io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ResourceFieldSelector,io.kubernetes.client.openapi.models.V1ResourceFieldSelectorBuilder>{
  public V1ResourceFieldSelectorBuilder() {
    this(false);
  }
  public V1ResourceFieldSelectorBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ResourceFieldSelector(), validationEnabled);
  }
  public V1ResourceFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ResourceFieldSelector(), validationEnabled);
  }
  public V1ResourceFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance) {
    this(fluent, instance, false);
  }
  public V1ResourceFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent,io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withContainerName(instance.getContainerName());

    fluent.withDivisor(instance.getDivisor());

    fluent.withResource(instance.getResource());

    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance) {
    this(instance,false);
  }
  public V1ResourceFieldSelectorBuilder(io.kubernetes.client.openapi.models.V1ResourceFieldSelector instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withContainerName(instance.getContainerName());

    this.withDivisor(instance.getDivisor());

    this.withResource(instance.getResource());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ResourceFieldSelectorFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ResourceFieldSelector build() {
    V1ResourceFieldSelector buildable = new V1ResourceFieldSelector();
    buildable.setContainerName(fluent.getContainerName());
    buildable.setDivisor(fluent.getDivisor());
    buildable.setResource(fluent.getResource());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ResourceFieldSelectorBuilder that = (V1ResourceFieldSelectorBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}