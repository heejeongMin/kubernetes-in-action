package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1SecretBuilder extends io.kubernetes.client.openapi.models.V1SecretFluentImpl<io.kubernetes.client.openapi.models.V1SecretBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Secret,io.kubernetes.client.openapi.models.V1SecretBuilder>{
  public V1SecretBuilder() {
    this(false);
  }
  public V1SecretBuilder(java.lang.Boolean validationEnabled) {
    this(new V1Secret(), validationEnabled);
  }
  public V1SecretBuilder(io.kubernetes.client.openapi.models.V1SecretFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretBuilder(io.kubernetes.client.openapi.models.V1SecretFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1Secret(), validationEnabled);
  }
  public V1SecretBuilder(io.kubernetes.client.openapi.models.V1SecretFluent<?> fluent,io.kubernetes.client.openapi.models.V1Secret instance) {
    this(fluent, instance, false);
  }
  public V1SecretBuilder(io.kubernetes.client.openapi.models.V1SecretFluent<?> fluent,io.kubernetes.client.openapi.models.V1Secret instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withData(instance.getData());

    fluent.withImmutable(instance.getImmutable());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withStringData(instance.getStringData());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretBuilder(io.kubernetes.client.openapi.models.V1Secret instance) {
    this(instance,false);
  }
  public V1SecretBuilder(io.kubernetes.client.openapi.models.V1Secret instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withData(instance.getData());

    this.withImmutable(instance.getImmutable());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withStringData(instance.getStringData());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1SecretFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1Secret build() {
    V1Secret buildable = new V1Secret();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setData(fluent.getData());
    buildable.setImmutable(fluent.getImmutable());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setStringData(fluent.getStringData());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SecretBuilder that = (V1SecretBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}