/*
 * Copyright (c) 2012 David Green
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package castledesigner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author David Green
 */
public class TileBuildingTest extends TestCase
{
	public TileBuildingTest(String testName)
	{
		super(testName);
	}

	public static Test suite()
	{
		TestSuite suite = new TestSuite(TileBuildingTest.class);
		return suite;
	}
	
	@Override
	protected void setUp() throws Exception
	{
		super.setUp();
	}
	
	@Override
	protected void tearDown() throws Exception
	{
		super.tearDown();
	}

	/**
	 * Test of getBuildingType method, of class TileBuilding.
	 */
	public void testGetBuildingType()
	{
		System.out.println("getBuildingType");

		for (BuildingType buildingType : BuildingType.values())
		{
			TileBuilding building = new TileBuilding(buildingType, 20);
			assertEquals(buildingType, building.getBuildingType());
		}
	}

	/**
	 * Test of getBuildingId method, of class TileBuilding.
	 */
	public void testGetBuildingId()
	{
		System.out.println("getBuildingId");

		int buildingId = 934;

		TileBuilding tileBuilding = new TileBuilding(BuildingType.SMALL_TOWER, buildingId);
		assertEquals(buildingId, tileBuilding.getBuildingId());
	}

	/**
	 * Test of setBuildingId method, of class TileBuilding.
	 */
	public void testSetBuildingId()
	{
		System.out.println("setBuildingId");

		int buildingId = 555;

		TileBuilding tileBuilding = new TileBuilding(BuildingType.LOOKOUT_TOWER, 99);
		tileBuilding.setBuildingId(buildingId);

		assertEquals(buildingId, tileBuilding.getBuildingId());
	}
}