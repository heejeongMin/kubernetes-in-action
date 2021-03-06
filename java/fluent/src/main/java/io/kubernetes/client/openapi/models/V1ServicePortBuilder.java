package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ServicePortBuilder extends io.kubernetes.client.openapi.models.V1ServicePortFluentImpl<io.kubernetes.client.openapi.models.V1ServicePortBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ServicePort,io.kubernetes.client.openapi.models.V1ServicePortBuilder>{
  public V1ServicePortBuilder() {
    this(false);
  }
  public V1ServicePortBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ServicePort(), validationEnabled);
  }
  public V1ServicePortBuilder(io.kubernetes.client.openapi.models.V1ServicePortFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ServicePortBuilder(io.kubernetes.client.openapi.models.V1ServicePortFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ServicePort(), validationEnabled);
  }
  public V1ServicePortBuilder(io.kubernetes.client.openapi.models.V1ServicePortFluent<?> fluent,io.kubernetes.client.openapi.models.V1ServicePort instance) {
    this(fluent, instance, false);
  }
  public V1ServicePortBuilder(io.kubernetes.client.openapi.models.V1ServicePortFluent<?> fluent,io.kubernetes.client.openapi.models.V1ServicePort instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAppProtocol(instance.getAppProtocol());

    fluent.withName(instance.getName());

    fluent.withNodePort(instance.getNodePort());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    fluent.withTargetPort(instance.getTargetPort());

    this.validationEnabled = validationEnabled; 
  }
  public V1ServicePortBuilder(io.kubernetes.client.openapi.models.V1ServicePort instance) {
    this(instance,false);
  }
  public V1ServicePortBuilder(io.kubernetes.client.openapi.models.V1ServicePort instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withNodePort(instance.getNodePort());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.withTargetPort(instance.getTargetPort());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ServicePortFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ServicePort build() {
    V1ServicePort buildable = new V1ServicePort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setNodePort(fluent.getNodePort());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    buildable.setTargetPort(fluent.getTargetPort());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ServicePortBuilder that = (V1ServicePortBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}