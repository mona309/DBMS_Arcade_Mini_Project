import pypandoc
import os

md_path = r"C:\Users\nanda\.gemini\antigravity\brain\adba8eea-419d-4160-84a0-6f6b2f4edf12\project_documentation.md"
docx_path = r"project_documentation.docx"

try:
    pypandoc.get_pandoc_path()
except OSError:
    print("Pandoc not found. Downloading...")
    pypandoc.download_pandoc()

print("Converting to DOCX...")
pypandoc.convert_file(md_path, 'docx', outputfile=docx_path)
print(f"Successfully converted to {os.path.abspath(docx_path)}")
