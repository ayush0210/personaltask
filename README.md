# PersonalTask - Android Task Management App

A simple and efficient task management application built with modern Android development practices. This app allows users to create, manage, and track their daily tasks with an intuitive interface.

## 📱 Features

- ✅ **Add Tasks**: Create new tasks with a simple input field
- ✅ **Mark Complete**: Mark tasks as completed with a single tap
- 🗑️ **Delete Tasks**: Remove unwanted tasks easily
- 📱 **Clean UI**: Material Design principles for better user experience
- 💾 **Local Storage**: All tasks stored locally using Room Database
- 🔄 **Real-time Updates**: Live data updates using ViewModel and LiveData
- 🏗️ **MVVM Architecture**: Clean architecture for maintainable code

## 🛠️ Technologies Used

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **Database**: Room Database
- **UI Components**: RecyclerView, Material Design Components
- **Data Binding**: LiveData for reactive UI updates
- **Lifecycle Management**: ViewModel and ComponentActivity

## 📋 Requirements

- Android Studio Arctic Fox or later
- Minimum SDK: API 21 (Android 5.0)
- Target SDK: API 34 (Android 14)
- Kotlin 1.8.0 or later

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/ayush0210/personaltask.git
   cd personaltask
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing Android Studio project"
   - Navigate to the cloned directory and select it

3. **Build the project**
   - Let Android Studio sync the project
   - Build → Make Project (Ctrl+F9)

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click Run (Shift+F10) or use the green play button

## 📖 Usage

### Adding a Task
1. Open the app
2. Type your task in the text field
3. Tap the "Add Task" button
4. Your task will appear in the list below

### Managing Tasks
- **Complete a Task**: Tap the checkbox next to the task
- **Delete a Task**: Tap the delete button/icon on the task item
- **View All Tasks**: All tasks are displayed in a scrollable list

## 🏗️ Project Structure

```
app/
├── src/main/java/com/example/personaltask/
│   ├── MainActivity.kt              # Main activity with UI logic
│   ├── Task.kt                      # Task data model
│   ├── TaskAdapter.kt              # RecyclerView adapter
│   └── database/
│       ├── TaskViewModel.kt        # ViewModel for task operations
│       ├── TaskRepository.kt       # Repository pattern implementation
│       ├── TaskDao.kt             # Database access object
│       └── TaskDatabase.kt        # Room database configuration
├── src/main/res/
│   ├── layout/
│   │   ├── activity_main.xml      # Main activity layout
│   │   └── task_item.xml          # Individual task item layout
│   └── values/
│       ├── strings.xml            # String resources
│       ├── colors.xml             # Color resources
│       └── themes.xml             # App themes
└── build.gradle                   # App-level dependencies
```

## 🔧 Key Components

### MainActivity
- Main entry point of the application
- Handles user interactions (add, complete, delete tasks)
- Observes task data changes using LiveData

### TaskViewModel
- Manages UI-related data lifecycle
- Provides data to the UI and survives configuration changes
- Handles all task operations (CRUD)

### TaskAdapter
- RecyclerView adapter for displaying tasks
- Handles item interactions (complete/delete callbacks)
- Updates UI when task data changes

### Room Database
- Local storage solution for persisting tasks
- Provides compile-time verification of SQL queries
- Includes TaskDao for database operations


## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 Future Enhancements

- [ ] Task categories and tags
- [ ] Due dates and reminders
- [ ] Task priority levels
- [ ] Dark mode support
- [ ] Task search and filtering
- [ ] Data export/import functionality
- [ ] Cloud synchronization

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Developer

**Ayush Mishra**
- GitHub: [@ayush0210](https://github.com/ayush0210)
- Email: [mishra.ayush.mscse@gmail.com]

## 🙏 Acknowledgments

- Material Design guidelines by Google
- Android Architecture Components
- Room Database documentation
- Kotlin coroutines for asynchronous operations

---

⭐ If you found this project helpful, please give it a star on GitHub!
