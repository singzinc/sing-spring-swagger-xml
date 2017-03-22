package singplayground.showcase.service;

import java.util.List;

import singplayground.showcase.model.TestMod;

public interface TestModService {

	public void saveOrupdateTest(TestMod testMod);

	public List<TestMod> listTestMod();
}
