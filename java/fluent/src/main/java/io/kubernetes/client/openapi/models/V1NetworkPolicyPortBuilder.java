package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1NetworkPolicyPortBuilder extends io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluentImpl<io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1NetworkPolicyPort,io.kubernetes.client.openapi.models.V1NetworkPolicyPortBuilder>{
  public V1NetworkPolicyPortBuilder() {
    this(false);
  }
  public V1NetworkPolicyPortBuilder(java.lang.Boolean validationEnabled) {
    this(new V1NetworkPolicyPort(), validationEnabled);
  }
  public V1NetworkPolicyPortBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicyPortBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicyPort(), validationEnabled);
  }
  public V1NetworkPolicyPortBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<?> fluent,io.kubernetes.client.openapi.models.V1NetworkPolicyPort instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicyPortBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<?> fluent,io.kubernetes.client.openapi.models.V1NetworkPolicyPort instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withEndPort(instance.getEndPort());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicyPortBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyPort instance) {
    this(instance,false);
  }
  public V1NetworkPolicyPortBuilder(io.kubernetes.client.openapi.models.V1NetworkPolicyPort instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withEndPort(instance.getEndPort());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1NetworkPolicyPortFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1NetworkPolicyPort build() {
    V1NetworkPolicyPort buildable = new V1NetworkPolicyPort();
    buildable.setEndPort(fluent.getEndPort());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1NetworkPolicyPortBuilder that = (V1NetworkPolicyPortBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}