package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta1ForZoneBuilder extends io.kubernetes.client.openapi.models.V1beta1ForZoneFluentImpl<io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1ForZone,io.kubernetes.client.openapi.models.V1beta1ForZoneBuilder>{
  public V1beta1ForZoneBuilder() {
    this(false);
  }
  public V1beta1ForZoneBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1ForZone(), validationEnabled);
  }
  public V1beta1ForZoneBuilder(io.kubernetes.client.openapi.models.V1beta1ForZoneFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1ForZoneBuilder(io.kubernetes.client.openapi.models.V1beta1ForZoneFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1ForZone(), validationEnabled);
  }
  public V1beta1ForZoneBuilder(io.kubernetes.client.openapi.models.V1beta1ForZoneFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ForZone instance) {
    this(fluent, instance, false);
  }
  public V1beta1ForZoneBuilder(io.kubernetes.client.openapi.models.V1beta1ForZoneFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ForZone instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1ForZoneBuilder(io.kubernetes.client.openapi.models.V1beta1ForZone instance) {
    this(instance,false);
  }
  public V1beta1ForZoneBuilder(io.kubernetes.client.openapi.models.V1beta1ForZone instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta1ForZoneFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta1ForZone build() {
    V1beta1ForZone buildable = new V1beta1ForZone();
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1ForZoneBuilder that = (V1beta1ForZoneBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}