package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1RoleBuilder extends io.kubernetes.client.openapi.models.V1RoleFluentImpl<io.kubernetes.client.openapi.models.V1RoleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Role,io.kubernetes.client.openapi.models.V1RoleBuilder>{
  public V1RoleBuilder() {
    this(false);
  }
  public V1RoleBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Role(), validationEnabled);
  }
  public V1RoleBuilder(io.kubernetes.client.openapi.models.V1RoleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RoleBuilder(io.kubernetes.client.openapi.models.V1RoleFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1Role(), validationEnabled);
  }
  public V1RoleBuilder(io.kubernetes.client.openapi.models.V1RoleFluent<?> fluent,io.kubernetes.client.openapi.models.V1Role instance) {
    this(fluent, instance, false);
  }
  public V1RoleBuilder(io.kubernetes.client.openapi.models.V1RoleFluent<?> fluent,io.kubernetes.client.openapi.models.V1Role instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  public V1RoleBuilder(io.kubernetes.client.openapi.models.V1Role instance) {
    this(instance,false);
  }
  public V1RoleBuilder(io.kubernetes.client.openapi.models.V1Role instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1RoleFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1Role build() {
    V1Role buildable = new V1Role();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setRules(fluent.getRules());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1RoleBuilder that = (V1RoleBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}