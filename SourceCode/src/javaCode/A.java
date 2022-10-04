package javaCode;/*
 *
 *  Copyright (c) 2021. Mark Grechanik and Lone Star Consulting, Inc. All rights reserved.
 *
 *   Unless required by applicable law or agreed to in writing, software distributed under
 *   the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *   either express or implied.  See the License for the specific language governing permissions and limitations under the License.
 *
 */

class A {
    /*void f() {
        System.out.println("A");
    }*/
}

class B extends A {
/*    void f() {
        System.out.println("B");
    }*/
}


class C extends B {
    void f() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        B [] ao = {new C(), new C(), new C(), new C()};
//        ao[1].f();
        B o = new C();
//        o.f();
        new C().f();
    }
}

