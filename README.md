## Justifying why the singelton design pattern is used for the timer class 

Global Access: Provides a single, global point of access to the timer, making it easy to start, stop, and measure elapsed time consistently.

Consistency: Ensures that only one timer is used across the application. This avoids problems that could arise if multiple timers were started and stopped independently.

Resource Management: A single timer instance conserves resources. Multiple timers could lead to unnecessary overhead and complexity in managing timer states.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
