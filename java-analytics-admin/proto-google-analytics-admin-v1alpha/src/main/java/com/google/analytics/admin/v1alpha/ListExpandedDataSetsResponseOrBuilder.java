/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface ListExpandedDataSetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.ListExpandedDataSetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of ExpandedDataSet. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ExpandedDataSet expanded_data_sets = 1;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.ExpandedDataSet> getExpandedDataSetsList();
  /**
   *
   *
   * <pre>
   * List of ExpandedDataSet. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ExpandedDataSet expanded_data_sets = 1;</code>
   */
  com.google.analytics.admin.v1alpha.ExpandedDataSet getExpandedDataSets(int index);
  /**
   *
   *
   * <pre>
   * List of ExpandedDataSet. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ExpandedDataSet expanded_data_sets = 1;</code>
   */
  int getExpandedDataSetsCount();
  /**
   *
   *
   * <pre>
   * List of ExpandedDataSet. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ExpandedDataSet expanded_data_sets = 1;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.ExpandedDataSetOrBuilder>
      getExpandedDataSetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of ExpandedDataSet. These will be ordered stably, but in an arbitrary
   * order.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.ExpandedDataSet expanded_data_sets = 1;</code>
   */
  com.google.analytics.admin.v1alpha.ExpandedDataSetOrBuilder getExpandedDataSetsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
