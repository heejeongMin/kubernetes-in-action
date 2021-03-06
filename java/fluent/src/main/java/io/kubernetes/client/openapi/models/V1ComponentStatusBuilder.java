package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ComponentStatusBuilder extends io.kubernetes.client.openapi.models.V1ComponentStatusFluentImpl<io.kubernetes.client.openapi.models.V1ComponentStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ComponentStatus,io.kubernetes.client.openapi.models.V1ComponentStatusBuilder>{
  public V1ComponentStatusBuilder() {
    this(false);
  }
  public V1ComponentStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ComponentStatus(), validationEnabled);
  }
  public V1ComponentStatusBuilder(io.kubernetes.client.openapi.models.V1ComponentStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ComponentStatusBuilder(io.kubernetes.client.openapi.models.V1ComponentStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ComponentStatus(), validationEnabled);
  }
  public V1ComponentStatusBuilder(io.kubernetes.client.openapi.models.V1ComponentStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1ComponentStatus instance) {
    this(fluent, instance, false);
  }
  public V1ComponentStatusBuilder(io.kubernetes.client.openapi.models.V1ComponentStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V1ComponentStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withConditions(instance.getConditions());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1ComponentStatusBuilder(io.kubernetes.client.openapi.models.V1ComponentStatus instance) {
    this(instance,false);
  }
  public V1ComponentStatusBuilder(io.kubernetes.client.openapi.models.V1ComponentStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withConditions(instance.getConditions());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ComponentStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ComponentStatus build() {
    V1ComponentStatus buildable = new V1ComponentStatus();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setConditions(fluent.getConditions());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ComponentStatusBuilder that = (V1ComponentStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}