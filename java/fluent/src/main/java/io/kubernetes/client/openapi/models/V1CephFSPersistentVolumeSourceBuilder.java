package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1CephFSPersistentVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource,io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceBuilder>{
  public V1CephFSPersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1CephFSPersistentVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CephFSPersistentVolumeSource(), validationEnabled);
  }
  public V1CephFSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CephFSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1CephFSPersistentVolumeSource(), validationEnabled);
  }
  public V1CephFSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1CephFSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMonitors(instance.getMonitors());

    fluent.withPath(instance.getPath());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretFile(instance.getSecretFile());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  public V1CephFSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1CephFSPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withMonitors(instance.getMonitors());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretFile(instance.getSecretFile());

    this.withSecretRef(instance.getSecretRef());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1CephFSPersistentVolumeSource build() {
    V1CephFSPersistentVolumeSource buildable = new V1CephFSPersistentVolumeSource();
    buildable.setMonitors(fluent.getMonitors());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretFile(fluent.getSecretFile());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CephFSPersistentVolumeSourceBuilder that = (V1CephFSPersistentVolumeSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}