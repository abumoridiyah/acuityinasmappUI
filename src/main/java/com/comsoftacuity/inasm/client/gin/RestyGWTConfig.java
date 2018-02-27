/*
 * Copyright (c)  Flexisaf Edusoft Ltd 2016.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.comsoftacuity.inasm.client.gin;

import com.google.gwt.user.client.Window;
import org.fusesource.restygwt.client.Defaults;

/**
 * Created by peter on 8/8/16.
 */
public class RestyGWTConfig {

    static {
        String apiUrl = Window.Location.getProtocol() + "//" + Window.Location.getHost() + "/acuityapp/v1";
        Defaults.setServiceRoot(apiUrl);
        Defaults.setDispatcher(new AuthorizationDispatcher());
        Defaults.setDateFormat("yyyy-MM-dd");
    }

}
