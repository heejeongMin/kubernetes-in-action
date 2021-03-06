package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1UserInfoBuilder extends io.kubernetes.client.openapi.models.V1UserInfoFluentImpl<io.kubernetes.client.openapi.models.V1UserInfoBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1UserInfo,io.kubernetes.client.openapi.models.V1UserInfoBuilder>{
  public V1UserInfoBuilder() {
    this(false);
  }
  public V1UserInfoBuilder(java.lang.Boolean validationEnabled) {
    this(new V1UserInfo(), validationEnabled);
  }
  public V1UserInfoBuilder(io.kubernetes.client.openapi.models.V1UserInfoFluent<?> fluent) {
    this(fluent, false);
  }
  public V1UserInfoBuilder(io.kubernetes.client.openapi.models.V1UserInfoFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1UserInfo(), validationEnabled);
  }
  public V1UserInfoBuilder(io.kubernetes.client.openapi.models.V1UserInfoFluent<?> fluent,io.kubernetes.client.openapi.models.V1UserInfo instance) {
    this(fluent, instance, false);
  }
  public V1UserInfoBuilder(io.kubernetes.client.openapi.models.V1UserInfoFluent<?> fluent,io.kubernetes.client.openapi.models.V1UserInfo instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withExtra(instance.getExtra());

    fluent.withGroups(instance.getGroups());

    fluent.withUid(instance.getUid());

    fluent.withUsername(instance.getUsername());

    this.validationEnabled = validationEnabled; 
  }
  public V1UserInfoBuilder(io.kubernetes.client.openapi.models.V1UserInfo instance) {
    this(instance,false);
  }
  public V1UserInfoBuilder(io.kubernetes.client.openapi.models.V1UserInfo instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withExtra(instance.getExtra());

    this.withGroups(instance.getGroups());

    this.withUid(instance.getUid());

    this.withUsername(instance.getUsername());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1UserInfoFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1UserInfo build() {
    V1UserInfo buildable = new V1UserInfo();
    buildable.setExtra(fluent.getExtra());
    buildable.setGroups(fluent.getGroups());
    buildable.setUid(fluent.getUid());
    buildable.setUsername(fluent.getUsername());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1UserInfoBuilder that = (V1UserInfoBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}