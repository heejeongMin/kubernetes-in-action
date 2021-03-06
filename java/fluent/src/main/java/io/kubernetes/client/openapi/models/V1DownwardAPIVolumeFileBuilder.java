package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1DownwardAPIVolumeFileBuilder extends io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluentImpl<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileBuilder>{
  public V1DownwardAPIVolumeFileBuilder() {
    this(false);
  }
  public V1DownwardAPIVolumeFileBuilder(java.lang.Boolean validationEnabled) {
    this(new V1DownwardAPIVolumeFile(), validationEnabled);
  }
  public V1DownwardAPIVolumeFileBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DownwardAPIVolumeFileBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1DownwardAPIVolumeFile(), validationEnabled);
  }
  public V1DownwardAPIVolumeFileBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<?> fluent,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile instance) {
    this(fluent, instance, false);
  }
  public V1DownwardAPIVolumeFileBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<?> fluent,io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFieldRef(instance.getFieldRef());

    fluent.withMode(instance.getMode());

    fluent.withPath(instance.getPath());

    fluent.withResourceFieldRef(instance.getResourceFieldRef());

    this.validationEnabled = validationEnabled; 
  }
  public V1DownwardAPIVolumeFileBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile instance) {
    this(instance,false);
  }
  public V1DownwardAPIVolumeFileBuilder(io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withFieldRef(instance.getFieldRef());

    this.withMode(instance.getMode());

    this.withPath(instance.getPath());

    this.withResourceFieldRef(instance.getResourceFieldRef());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFileFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1DownwardAPIVolumeFile build() {
    V1DownwardAPIVolumeFile buildable = new V1DownwardAPIVolumeFile();
    buildable.setFieldRef(fluent.getFieldRef());
    buildable.setMode(fluent.getMode());
    buildable.setPath(fluent.getPath());
    buildable.setResourceFieldRef(fluent.getResourceFieldRef());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1DownwardAPIVolumeFileBuilder that = (V1DownwardAPIVolumeFileBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}