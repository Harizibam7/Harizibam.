/*
  Warnings:

  - A unique constraint covering the columns `[email]` on the table `Todos` will be added. If there are existing duplicate values, this will fail.
  - Added the required column `email` to the `Todos` table without a default value. This is not possible if the table is not empty.

*/
-- AlterTable
ALTER TABLE "Todos" ADD COLUMN     "email" TEXT NOT NULL;

-- CreateIndex
CREATE UNIQUE INDEX "Todos_email_key" ON "Todos"("email");
