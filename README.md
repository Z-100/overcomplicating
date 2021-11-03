# 🤡 Overcomplicating

Simple tasks in Java, just solved unnecessary complicated (and with bad code). This repository cleary shows HOW NOT TO DO IT!

## 🧪 Testing

Although this repo clearly shows how not to do things, we want to automatically test our code with unit tests. This also allows for easy testing while coding without needing to create a playground class.

You can run a test through your IDE or with the following command:

```bash
mvn test
```

If all tests ran successfully, a message like this should appear:

```bash
[INFO] Results:
[INFO] 
[INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

## 📝 Javadoc

Documenting the code is also an important thing in development. You don't have to comment everything, but a brief description of your methods would be nice.

To generate the Javadoc Webpage, use the following command:

```bash
mvn site
````

You can then open the Javadocs in your preferred browser:

```bash
firefox target/site/apidocs/index.html
```

## 👥 Contributing

Contributions are always welcome! See [CONTRIBUTING.md](CONTRIBUTING.md) for more information.
