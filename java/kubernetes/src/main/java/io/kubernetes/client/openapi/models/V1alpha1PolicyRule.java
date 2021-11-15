/*
Copyright 2021 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PolicyRule holds information that describes a policy rule, but does not contain information about
 * who the rule applies to or which namespace the rule applies to.
 */
@ApiModel(
    description =
        "PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-09-20T22:55:54.394Z[Etc/UTC]")
public class V1alpha1PolicyRule {
  public static final String SERIALIZED_NAME_API_GROUPS = "apiGroups";

  @SerializedName(SERIALIZED_NAME_API_GROUPS)
  private List<String> apiGroups = null;

  public static final String SERIALIZED_NAME_NON_RESOURCE_U_R_LS = "nonResourceURLs";

  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_U_R_LS)
  private List<String> nonResourceURLs = null;

  public static final String SERIALIZED_NAME_RESOURCE_NAMES = "resourceNames";

  @SerializedName(SERIALIZED_NAME_RESOURCE_NAMES)
  private List<String> resourceNames = null;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";

  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<String> resources = null;

  public static final String SERIALIZED_NAME_VERBS = "verbs";

  @SerializedName(SERIALIZED_NAME_VERBS)
  private List<String> verbs = new ArrayList<>();

  public V1alpha1PolicyRule apiGroups(List<String> apiGroups) {

    this.apiGroups = apiGroups;
    return this;
  }

  public V1alpha1PolicyRule addApiGroupsItem(String apiGroupsItem) {
    if (this.apiGroups == null) {
      this.apiGroups = new ArrayList<>();
    }
    this.apiGroups.add(apiGroupsItem);
    return this;
  }

  /**
   * APIGroups is the name of the APIGroup that contains the resources. If multiple API groups are
   * specified, any action requested against one of the enumerated resources in any API group will
   * be allowed.
   *
   * @return apiGroups
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.")
  public List<String> getApiGroups() {
    return apiGroups;
  }

  public void setApiGroups(List<String> apiGroups) {
    this.apiGroups = apiGroups;
  }

  public V1alpha1PolicyRule nonResourceURLs(List<String> nonResourceURLs) {

    this.nonResourceURLs = nonResourceURLs;
    return this;
  }

  public V1alpha1PolicyRule addNonResourceURLsItem(String nonResourceURLsItem) {
    if (this.nonResourceURLs == null) {
      this.nonResourceURLs = new ArrayList<>();
    }
    this.nonResourceURLs.add(nonResourceURLsItem);
    return this;
  }

  /**
   * NonResourceURLs is a set of partial urls that a user should have access to. *s are allowed, but
   * only as the full, final step in the path Since non-resource URLs are not namespaced, this field
   * is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either
   * apply to API resources (such as \&quot;pods\&quot; or \&quot;secrets\&quot;) or non-resource
   * URL paths (such as \&quot;/api\&quot;), but not both.
   *
   * @return nonResourceURLs
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as \"pods\" or \"secrets\") or non-resource URL paths (such as \"/api\"),  but not both.")
  public List<String> getNonResourceURLs() {
    return nonResourceURLs;
  }

  public void setNonResourceURLs(List<String> nonResourceURLs) {
    this.nonResourceURLs = nonResourceURLs;
  }

  public V1alpha1PolicyRule resourceNames(List<String> resourceNames) {

    this.resourceNames = resourceNames;
    return this;
  }

  public V1alpha1PolicyRule addResourceNamesItem(String resourceNamesItem) {
    if (this.resourceNames == null) {
      this.resourceNames = new ArrayList<>();
    }
    this.resourceNames.add(resourceNamesItem);
    return this;
  }

  /**
   * ResourceNames is an optional white list of names that the rule applies to. An empty set means
   * that everything is allowed.
   *
   * @return resourceNames
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.")
  public List<String> getResourceNames() {
    return resourceNames;
  }

  public void setResourceNames(List<String> resourceNames) {
    this.resourceNames = resourceNames;
  }

  public V1alpha1PolicyRule resources(List<String> resources) {

    this.resources = resources;
    return this;
  }

  public V1alpha1PolicyRule addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Resources is a list of resources this rule applies to. &#39;*&#39; represents all resources.
   *
   * @return resources
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Resources is a list of resources this rule applies to. '*' represents all resources.")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public V1alpha1PolicyRule verbs(List<String> verbs) {

    this.verbs = verbs;
    return this;
  }

  public V1alpha1PolicyRule addVerbsItem(String verbsItem) {
    this.verbs.add(verbsItem);
    return this;
  }

  /**
   * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
   * contained in this rule. &#39;*&#39; represents all verbs.
   *
   * @return verbs
   */
  @ApiModelProperty(
      required = true,
      value =
          "Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule. '*' represents all verbs.")
  public List<String> getVerbs() {
    return verbs;
  }

  public void setVerbs(List<String> verbs) {
    this.verbs = verbs;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PolicyRule v1alpha1PolicyRule = (V1alpha1PolicyRule) o;
    return Objects.equals(this.apiGroups, v1alpha1PolicyRule.apiGroups)
        && Objects.equals(this.nonResourceURLs, v1alpha1PolicyRule.nonResourceURLs)
        && Objects.equals(this.resourceNames, v1alpha1PolicyRule.resourceNames)
        && Objects.equals(this.resources, v1alpha1PolicyRule.resources)
        && Objects.equals(this.verbs, v1alpha1PolicyRule.verbs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiGroups, nonResourceURLs, resourceNames, resources, verbs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PolicyRule {\n");
    sb.append("    apiGroups: ").append(toIndentedString(apiGroups)).append("\n");
    sb.append("    nonResourceURLs: ").append(toIndentedString(nonResourceURLs)).append("\n");
    sb.append("    resourceNames: ").append(toIndentedString(resourceNames)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    verbs: ").append(toIndentedString(verbs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}