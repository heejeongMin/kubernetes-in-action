package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1IPBlockBuilder extends io.kubernetes.client.openapi.models.V1IPBlockFluentImpl<io.kubernetes.client.openapi.models.V1IPBlockBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1IPBlock,io.kubernetes.client.openapi.models.V1IPBlockBuilder>{
  public V1IPBlockBuilder() {
    this(false);
  }
  public V1IPBlockBuilder(java.lang.Boolean validationEnabled) {
    this(new V1IPBlock(), validationEnabled);
  }
  public V1IPBlockBuilder(io.kubernetes.client.openapi.models.V1IPBlockFluent<?> fluent) {
    this(fluent, false);
  }
  public V1IPBlockBuilder(io.kubernetes.client.openapi.models.V1IPBlockFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1IPBlock(), validationEnabled);
  }
  public V1IPBlockBuilder(io.kubernetes.client.openapi.models.V1IPBlockFluent<?> fluent,io.kubernetes.client.openapi.models.V1IPBlock instance) {
    this(fluent, instance, false);
  }
  public V1IPBlockBuilder(io.kubernetes.client.openapi.models.V1IPBlockFluent<?> fluent,io.kubernetes.client.openapi.models.V1IPBlock instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCidr(instance.getCidr());

    fluent.withExcept(instance.getExcept());

    this.validationEnabled = validationEnabled; 
  }
  public V1IPBlockBuilder(io.kubernetes.client.openapi.models.V1IPBlock instance) {
    this(instance,false);
  }
  public V1IPBlockBuilder(io.kubernetes.client.openapi.models.V1IPBlock instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withCidr(instance.getCidr());

    this.withExcept(instance.getExcept());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1IPBlockFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1IPBlock build() {
    V1IPBlock buildable = new V1IPBlock();
    buildable.setCidr(fluent.getCidr());
    buildable.setExcept(fluent.getExcept());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1IPBlockBuilder that = (V1IPBlockBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}