/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.osconfig.v1alpha.samples;

// [START osconfig_v1alpha_generated_OsConfigZonalService_ListOSPolicyAssignments_Paged_async]
import com.google.cloud.osconfig.v1alpha.ListOSPolicyAssignmentsRequest;
import com.google.cloud.osconfig.v1alpha.ListOSPolicyAssignmentsResponse;
import com.google.cloud.osconfig.v1alpha.LocationName;
import com.google.cloud.osconfig.v1alpha.OSPolicyAssignment;
import com.google.cloud.osconfig.v1alpha.OsConfigZonalServiceClient;
import com.google.common.base.Strings;

public class AsyncListOSPolicyAssignmentsPaged {

  public static void main(String[] args) throws Exception {
    asyncListOSPolicyAssignmentsPaged();
  }

  public static void asyncListOSPolicyAssignmentsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (OsConfigZonalServiceClient osConfigZonalServiceClient =
        OsConfigZonalServiceClient.create()) {
      ListOSPolicyAssignmentsRequest request =
          ListOSPolicyAssignmentsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListOSPolicyAssignmentsResponse response =
            osConfigZonalServiceClient.listOSPolicyAssignmentsCallable().call(request);
        for (OSPolicyAssignment element : response.getOsPolicyAssignmentsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END osconfig_v1alpha_generated_OsConfigZonalService_ListOSPolicyAssignments_Paged_async]
