package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1ForZoneBuilder extends io.kubernetes.client.openapi.models.V1ForZoneFluentImpl<io.kubernetes.client.openapi.models.V1ForZoneBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ForZone,io.kubernetes.client.openapi.models.V1ForZoneBuilder>{
  public V1ForZoneBuilder() {
    this(false);
  }
  public V1ForZoneBuilder(java.lang.Boolean validationEnabled) {
    this(new V1ForZone(), validationEnabled);
  }
  public V1ForZoneBuilder(io.kubernetes.client.openapi.models.V1ForZoneFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ForZoneBuilder(io.kubernetes.client.openapi.models.V1ForZoneFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1ForZone(), validationEnabled);
  }
  public V1ForZoneBuilder(io.kubernetes.client.openapi.models.V1ForZoneFluent<?> fluent,io.kubernetes.client.openapi.models.V1ForZone instance) {
    this(fluent, instance, false);
  }
  public V1ForZoneBuilder(io.kubernetes.client.openapi.models.V1ForZoneFluent<?> fluent,io.kubernetes.client.openapi.models.V1ForZone instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1ForZoneBuilder(io.kubernetes.client.openapi.models.V1ForZone instance) {
    this(instance,false);
  }
  public V1ForZoneBuilder(io.kubernetes.client.openapi.models.V1ForZone instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1ForZoneFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1ForZone build() {
    V1ForZone buildable = new V1ForZone();
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ForZoneBuilder that = (V1ForZoneBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}