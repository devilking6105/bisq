/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

import bisq.asset.AbstractAssetTest;

import org.junit.Test;

public class HelpTheHomelessTest extends AbstractAssetTest {

    public HelpTheHomelessTest() {
        super(new HelpTheHomeless());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("HNbhe1Pfm2eH8d5NthFTzEZNwdzDJFKw6V");
        assertValidAddress("HErzbap76Sn6dWWCVhVcCbdhsVyHEjVYNy");
    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("Fnbhe1Pfm2eH8d5NthFTzEZNwdzDJHKw6V");
        assertInvalidAddress("HNBhe1Pfm2eh8d5NthFTzEZNwdzDJFKw6V");
        assertInvalidAddress("Kw6Ve1Pfm2eH8d5NthFTzEZNwdzDJFHNbh");
        assertInvalidAddress("Nbhe1Pfm2eH8d5NthFTzEZNwdzDJVKw6F#");
        assertInvalidAddress("VNbhe6Pfz2eH8d5NthFTmEZNwdzDJFKw1H");
    }
}
