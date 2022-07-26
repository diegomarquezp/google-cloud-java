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

package com.google.cloud.websecurityscanner.v1alpha.samples;

// [START websecurityscanner_v1alpha_generated_websecurityscannerclient_updatescanconfig_scanconfigfieldmask_sync]
import com.google.cloud.websecurityscanner.v1alpha.ScanConfig;
import com.google.cloud.websecurityscanner.v1alpha.WebSecurityScannerClient;
import com.google.protobuf.FieldMask;

public class SyncUpdateScanConfigScanconfigFieldmask {

  public static void main(String[] args) throws Exception {
    syncUpdateScanConfigScanconfigFieldmask();
  }

  public static void syncUpdateScanConfigScanconfigFieldmask() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
      ScanConfig scanConfig = ScanConfig.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      ScanConfig response = webSecurityScannerClient.updateScanConfig(scanConfig, updateMask);
    }
  }
}
// [END websecurityscanner_v1alpha_generated_websecurityscannerclient_updatescanconfig_scanconfigfieldmask_sync]
