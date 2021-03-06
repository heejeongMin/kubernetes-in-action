package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class DiscoveryV1EndpointPortBuilder extends io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortFluentImpl<io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort,io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortBuilder>{
  public DiscoveryV1EndpointPortBuilder() {
    this(false);
  }
  public DiscoveryV1EndpointPortBuilder(java.lang.Boolean validationEnabled) {
    this(new DiscoveryV1EndpointPort(), validationEnabled);
  }
  public DiscoveryV1EndpointPortBuilder(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortFluent<?> fluent) {
    this(fluent, false);
  }
  public DiscoveryV1EndpointPortBuilder(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new DiscoveryV1EndpointPort(), validationEnabled);
  }
  public DiscoveryV1EndpointPortBuilder(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortFluent<?> fluent,io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort instance) {
    this(fluent, instance, false);
  }
  public DiscoveryV1EndpointPortBuilder(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortFluent<?> fluent,io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAppProtocol(instance.getAppProtocol());

    fluent.withName(instance.getName());

    fluent.withPort(instance.getPort());

    fluent.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  public DiscoveryV1EndpointPortBuilder(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort instance) {
    this(instance,false);
  }
  public DiscoveryV1EndpointPortBuilder(io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.DiscoveryV1EndpointPortFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.DiscoveryV1EndpointPort build() {
    DiscoveryV1EndpointPort buildable = new DiscoveryV1EndpointPort();
    buildable.setAppProtocol(fluent.getAppProtocol());
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    DiscoveryV1EndpointPortBuilder that = (DiscoveryV1EndpointPortBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}