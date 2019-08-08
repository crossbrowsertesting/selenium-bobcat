<h3><strong>Getting Started With Bobcat and CrossBrowserTesting</strong></h3>
<p><em>For this document, we provide example tests located in our <a href="https://github.com/crossbrowsertesting/selenium-bobcat">Bobcat Github Repository</a>.</em></p>
<p><a href="https://cognifide.github.io/bobcat/">Bobcat</a> is framework dedicated to automated functional testing of web applications. It wraps Selenium, so anything possible in raw Selenium can be done with Bobcat. In this guide we will use Bobcat along with the <a href="https://www.seleniumhq.org/">Selenium Webdriver</a> and the <a href="https://www.java.com/en/">Java</a> programming language.</p>
<h3>Setting Up Bobcat</h3>
<ol>
<li>Ensure <a href="https://www.java.com/en/">Java</a> is installed on your machine. If you do not have Java installed, we recommend following the documentation: <a href="https://www.java.com/en/download/help/download_options.xml">https://www.java.com/en/download/help/download_options.xml</a></li>
<li>Download the <a href="https://github.com/Cognifide/bobcat-gradle-template">Bobcat template</a>.</li>
<li>Create a new project using the command:
<pre>./gradlew generate -i -Ptarget=PROJECT_DIRECTORY -Ptemplate=TEMPLATE_TO_USE</pre>
<ul>
<li><code>target</code> - directory where the Bobcat project will be generated (by default it will be created inside this cloned/downloaded repository - which we don't recommend as it will be deleted each time project is generated)</li>
<li><code>template</code> - determines which template from the ones available will be used to generate the project (the default template is <code>bobcat-junit</code>)</li>
</ul>
</li>
</ol>
<h3>Running A Test</h3>
<div class="blue-alert">You’ll need to use your Username and Authkey to run your tests on CrossBrowserTesting. To get yours, sign up for a <a href="https://crossbrowsertesting.com/freetrial"><b>free trial</b></a> or purchase a <a href="https://crossbrowsertesting.com/pricing"><b>plan</b></a>.</div>
<ol>
<li>Navigate to the chosen PROJECT_DIRECTORY</li>
<li>Edit file ../src/main/resources/config.yaml to contain:
<pre><code>default:
  properties:
    webdriver.type: remote
    webdriver.url: http://YOUR_USERNAME:YOUR_AUTHKEY@hub.crossbrowsertesting.com:80/wd/hub
    webdriver.cap.platform: Windows
    webdriver.cap.browserName: chrome
    webdriver.cap.recordVideo: true
    webdriver.cap.name: Bobcat Example </code></pre>
<p>Be sure to enter your username, encoding the @ with %40, and authkey</p>
</li>
<li>Run the default test included using the command:
<pre>./gradlew clean test </pre>
</li>
</ol>
<p>Congratulations! You have successfully configured an automated test using Bobcat. Now you are ready to see your test start to run in the <a href="https://app.crossbrowsertesting.com/selenium/results">Crossbrowsertesting app</a>.</p>
<h3>Conclusions</h3>
<p>By following the steps outlined in this guide, you are now able to seamlessly integrate Bobcat and CrossBrowserTesting. If you have any questions or concerns, please feel free to reach out to our <a href="mailto:support@crossbrowsertesting.com">support team</a>.</p>
