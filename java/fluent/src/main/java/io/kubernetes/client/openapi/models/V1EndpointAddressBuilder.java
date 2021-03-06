package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1EndpointAddressBuilder extends io.kubernetes.client.openapi.models.V1EndpointAddressFluentImpl<io.kubernetes.client.openapi.models.V1EndpointAddressBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1EndpointAddress,io.kubernetes.client.openapi.models.V1EndpointAddressBuilder>{
  public V1EndpointAddressBuilder() {
    this(false);
  }
  public V1EndpointAddressBuilder(java.lang.Boolean validationEnabled) {
    this(new V1EndpointAddress(), validationEnabled);
  }
  public V1EndpointAddressBuilder(io.kubernetes.client.openapi.models.V1EndpointAddressFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EndpointAddressBuilder(io.kubernetes.client.openapi.models.V1EndpointAddressFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1EndpointAddress(), validationEnabled);
  }
  public V1EndpointAddressBuilder(io.kubernetes.client.openapi.models.V1EndpointAddressFluent<?> fluent,io.kubernetes.client.openapi.models.V1EndpointAddress instance) {
    this(fluent, instance, false);
  }
  public V1EndpointAddressBuilder(io.kubernetes.client.openapi.models.V1EndpointAddressFluent<?> fluent,io.kubernetes.client.openapi.models.V1EndpointAddress instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withHostname(instance.getHostname());

    fluent.withIp(instance.getIp());

    fluent.withNodeName(instance.getNodeName());

    fluent.withTargetRef(instance.getTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  public V1EndpointAddressBuilder(io.kubernetes.client.openapi.models.V1EndpointAddress instance) {
    this(instance,false);
  }
  public V1EndpointAddressBuilder(io.kubernetes.client.openapi.models.V1EndpointAddress instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withHostname(instance.getHostname());

    this.withIp(instance.getIp());

    this.withNodeName(instance.getNodeName());

    this.withTargetRef(instance.getTargetRef());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1EndpointAddressFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1EndpointAddress build() {
    V1EndpointAddress buildable = new V1EndpointAddress();
    buildable.setHostname(fluent.getHostname());
    buildable.setIp(fluent.getIp());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setTargetRef(fluent.getTargetRef());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1EndpointAddressBuilder that = (V1EndpointAddressBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}